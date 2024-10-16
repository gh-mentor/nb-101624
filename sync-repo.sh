# This bash script uses git to sync changes between a local and remote GitHub repository on branch 'main'.

# Print message 'Synced changes with remote repository'
echo "Synced changes with remote repository"

# Pull changes from remote repository
git pull 

# Stage all changes
git add .

# Commit changes with message 'Updated'
git commit -m "Updated"

# Push changes to remote repository on branch 'main'
git push 


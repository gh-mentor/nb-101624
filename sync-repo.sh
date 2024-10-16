# This bash script uses git to sync changes between a local and remote GitHub repository on branch 'main'.

# Print message
echo "Synced changes with remote repository"

# Pull changes from remote repository
git pull origin main

# Stage all changes
git add .

# Commit changes
git commit -m "Synced changes"

# Push changes to remote repository on branch 'main'
git push origin main
